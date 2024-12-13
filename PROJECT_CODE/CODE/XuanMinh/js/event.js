$(window).on('load', function (event) {
    $('body').removeClass('preloading');
    $('.loadingLove').delay(1000).fadeOut('fast');

    /////////////////////////////////////////////
    // Hiệu ứng trái tim di chuyển
    function getHeart(e) {
        let ele = document.createElement("div");
        ele.className = "element";
        document.querySelector("body").prepend(ele);
        ele.style.left = e.clientX + 'px';
        ele.style.top = e.clientY - 10 + 'px';
        setTimeout(() => {
            ele.style.opacity = 0;
            ele.style.transform = 'scale(0.4)';
            ele.innerHTML = "💗";
            ele.style.zIndex = "100";

            setTimeout(() => {
                ele.remove();
            }, 1000);
        }, 10);
    }

    document.onmousemove = function (e) {
        getHeart(e);
    };

    document.onclick = function (e) {
        let ele = document.createElement("div");
        ele.className = "heartRain";
        document.querySelector("body").prepend(ele);
        ele.style.left = e.clientX - 10 + 'px';
        ele.style.top = e.clientY - 10 + 'px';
        ele.innerHTML = "💗";
        setTimeout(() => {
            ele.style.top = "calc(85% - 25px)";
        }, 100);
        setTimeout(() => {
            ele.style.opacity = 0;
        }, 3000);
        setTimeout(() => {
            ele.remove();
        }, 4000);
    };

    document.onmousedown = (e) => {
        getHeart(e);
    };

    /////////////////////////////////////////////
    // Hàm tải JSON và lấy 3 câu ngẫu nhiên
    async function getRandomQuotes() {
        try {
            const response = await fetch('../json/qoute.json'); // Fetch dữ liệu từ JSON
            const data = await response.json();

            const quotes = data.qoute; // Lấy danh sách các câu chúc
            const randomQuotes = [];
            while (randomQuotes.length < 3) {
                const randomIndex = Math.floor(Math.random() * quotes.length);
                const randomQuote = quotes[randomIndex];
                if (!randomQuotes.includes(randomQuote)) {
                    randomQuotes.push(randomQuote);
                }
            }

            return randomQuotes; // Trả về danh sách 3 câu chúc
        } catch (error) {
            console.error('Lỗi khi tải file JSON:', error);
            return ["Không thể tải câu chúc."]; // Câu mặc định nếu lỗi
        }
    }

    /////////////////////////////////////////////
    // Hiển thị nội dung từng ký tự
    let indexTextContent = 0;
    let textLetterContent = document.querySelector('.contentLetter');
    let timeoutId; // Lưu trữ ID của setTimeout để có thể xóa khi cần

    async function textCharLetterContent() {
        const randomQuotes = await getRandomQuotes(); // Lấy 3 câu chúc ngẫu nhiên từ JSON
        const fullText = randomQuotes.join('\n'); // Gộp 3 câu thành một chuỗi, cách nhau bởi xuống dòng
        textLetterContent.textContent = ''; // Xóa nội dung cũ
        indexTextContent = 0; // Reset index

        function displayChar() {
            if (indexTextContent < fullText.length) {
                textLetterContent.textContent += fullText[indexTextContent];
                indexTextContent++;
                timeoutId = setTimeout(displayChar, 50); // Lưu ID của setTimeout
            }
        }

        displayChar(); // Bắt đầu hiển thị từng ký tự
    }

    /////////////////////////////////////////////
    // Thêm sự kiện click vào các hộp thư
    document.querySelectorAll("[id^=letter_]").forEach((element) => {
        element.addEventListener("click", function () {
            $(".wrapperLetterForm").fadeIn(); // Hiển thị form với hiệu ứng mờ dần
            clearTimeout(timeoutId); // Xóa mọi timeout trước đó
            textCharLetterContent(); // Gọi hàm hiển thị 3 câu chúc
        });
    });

    // Ẩn form khi nhấn vào nút đóng
    document.querySelector(".fa-xmark").addEventListener("click", function () {
        $(".wrapperLetterForm").fadeOut(); // Ẩn form với hiệu ứng mờ dần
        textLetterContent.textContent = ''; // Xóa nội dung cũ
        clearTimeout(timeoutId); // Dừng tất cả các timeout đang chạy
    });
});
