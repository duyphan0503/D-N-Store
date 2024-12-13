$(window).load(function(){
	$('.loading').fadeOut('fast');
	$('.container').fadeIn('fast');
});
$('document').ready(function(){

	var vw;
	$(window).resize(function(){
			vw = $(window).width()/2;
		$('#b1,#b2,#b3,#b4,#b5,#b6,#b7').stop();
	});
	
	$('#turn_on').click(function(){
		$('#bulb_yellow').addClass('bulb-glow-yellow');
		$('#bulb_red').addClass('bulb-glow-red');
		$('#bulb_blue').addClass('bulb-glow-blue');
		$('#bulb_green').addClass('bulb-glow-green');
		$('#bulb_pink').addClass('bulb-glow-pink');
		$('#bulb_orange').addClass('bulb-glow-orange');
		$('body').addClass('peach');
		$(this).fadeOut('slow').delay(5000).promise().done(function(){
			$('#play').fadeIn('slow');
		});			
	});
	
	function loopOne() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b1').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopOne();
		});
	}
	
	function loopTwo() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b2').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopTwo();
		});
	}
	
	function loopThree() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b3').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopThree();
		});
	}
	
	function loopFour() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b4').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopFour();
		});
	}
	
	function loopFive() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b5').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopFive();
		});
	}
	
	function loopSix() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b6').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopSix();
		});
	}
	
	function loopSeven() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b7').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopSeven();
		});
	}
	
	function loopEight() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b8').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopEight();
		});
	}
	
	function loopNine() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b9').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopNine();
		});
	}
	
	function loopTen() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b10').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopTen();
		});
	}
	
	function loopEleven() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b11').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopEleven();
		});
	}
	
	function loopTwelve() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b12').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopTwelve();
		});
	}
	
	function loopThirteen() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b13').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopThirteen();
		});
	}
	
	function loopFourteen() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b14').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopFourteen();
		});
	}
	function loopFifteen() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b15').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopFifteen();
		});
	}
	
	function loopSixteen() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b16').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopSixteen();
		});
	}
	
	function loopSeventeen() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b17').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopSeventeen();
		});
	}
	
	function loopEighteen() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b18').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopEighteen();
		});
	}
	
	function loopNineteen() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b19').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopNineteen();
		});
	}
	
	function loopTwenty() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b20').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopTwenty();
		});
	}
	
	function loopTwentyOne() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b21').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopTwentyOne();
		});
	}
	
	function loopTwentyTwo() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b22').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopTwentyTwo();
		});
	}
	
	function loopTwentyThree() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b23').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopTwentyThree();
		});
	}
	
	function loopTwentyFour() {
		var randleft = $(window).width() * Math.random();
		var randtop = $(window).height() * Math.random();
		$('#b24').animate({ left: randleft, bottom: randtop }, 10000, function () {
			loopTwentyFour();
		});
	}
	
	function loopTwentyFive() {
		var randright = $(window).width() * Math.random();
		var randbottom = $(window).height() * Math.random();
		$('#b25').animate({ right: randright, bottom: randbottom }, 10000, function () {
			loopTwentyFive();
		});
	}
	
	function loopTwentySix() {
		var randright = $(window).width() * Math.random();
		var randbottom = $(window).height() * Math.random();
		$('#b26').animate({ right: randright, bottom: randbottom }, 10000, function () {
			loopTwentySix();
		});
	}
	
	function loopTwentySeven() {
		var randright = $(window).width() * Math.random();
		var randbottom = $(window).height() * Math.random();
		$('#b27').animate({ right: randright, bottom: randbottom }, 10000, function () {
			loopTwentySeven();
		});
	}
	
	function loopTwentyEight() {
		var randright = $(window).width() * Math.random();
		var randbottom = $(window).height() * Math.random();
		$('#b28').animate({ right: randright, bottom: randbottom }, 10000, function () {
			loopTwentyEight();
		});
	}
	
	function loopTwentyNine() {
		var randright = $(window).width() * Math.random();
		var randbottom = $(window).height() * Math.random();
		$('#b29').animate({ right: randright, bottom: randbottom }, 10000, function () {
			loopTwentyNine();
		});
	}
	
	function loopThirty() {
		var randright = $(window).width() * Math.random();
		var randbottom = $(window).height() * Math.random();
		$('#b30').animate({ right: randright, bottom: randbottom }, 10000, function () {
			loopThirty();
		});
	}
	
	
	$('#play').click(function(){
		var audio = $('#myMusic')[0];
		audio.play();
		
		// Lưu trạng thái nhạc (đang phát) và thời gian hiện tại vào localStorage
		localStorage.setItem('musicPlaying', 'true');
		 // Lắng nghe sự kiện timeupdate để lưu thời gian phát nhạc hiện tại vào localStorage
		 audio.addEventListener('timeupdate', function() {
			localStorage.setItem('musicTime', audio.currentTime);
		});
		
		// Các hiệu ứng và thay đổi giao diện khác
		$('#bulb_yellow').addClass('bulb-glow-yellow-after');
		$('#bulb_red').addClass('bulb-glow-red-after');
		$('#bulb_blue').addClass('bulb-glow-blue-after');
		$('#bulb_green').addClass('bulb-glow-green-after');
		$('#bulb_pink').addClass('bulb-glow-pink-after');
		$('#bulb_orange').addClass('bulb-glow-orange-after');
		$('body').css('background-color', '#FFF');
		$('body').addClass('peach-after');
		$(this).fadeOut('slow').delay(6000).promise().done(function(){
			$('#show').fadeIn('slow');
		});
		
		$('#b1,#b4,#b5,#b7,#b9,#b11,#b13,#b15,#b17,#b19,#b21,#b23,#b25,#b27,#b29').addClass('balloons-rotate-behaviour-one');
		$('#b2,#b3','#b6','#b8','#b10','#b12','#b14','#b16','#b18','#b20','#b22','#b24','#b26','#b28','#b30').addClass('balloons-rotate-behaviour-two');
		
		// Các hàm loop tiếp theo
		loopOne();
		loopTwo();
		loopThree();
		loopFour();
		loopFive();
		loopSix();
		loopSeven();
		loopEight();
		loopNine();
		loopTen();
		loopEleven();
		loopTwelve();
		loopThirteen();
		loopFourteen();
		loopFifteen();
		loopSixteen();
		loopSeventeen();
	});
	
	
});
