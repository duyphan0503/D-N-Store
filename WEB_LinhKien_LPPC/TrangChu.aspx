<%@ Page Language="C#" AutoEventWireup="true" CodeFile="TrangChu.aspx.cs" Inherits="TrangChu" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Trang Chủ</title>
    <link href="header.css" rel="stylesheet" />
    <link href="assets/fontawesome-free-6.3.0-web/css/all.min.css" rel="stylesheet" />
</head>
<body>

    <form id="form1" runat="server">
        <header>
            <div id="inner-header">
                <div id="item-top">
                    <div class="inner container">
                        <div class="items-right">
                            <p>Trang Web là sản phẩm học tập</p>
                        </div>
                        <div class="items-left">
                            <ul>
                                <li>
                                    <i class="fa-solid fa-book"></i>
                                    <a href="#" class="text-link">Chính sách bán hàng</a>
                                </li>
                                <li>
                                    <i class="fa-solid fa-certificate"></i>
                                    <a href="#" class="text-link">Thông tin trang web</a>
                                </li>
                                <li>
                                    <i class="fa-solid fa-phone"></i>
                                    <a href="#" class="text-link">Thông tin liên hệ</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div id="menu">
                    <div class="inner container">
                        <div class="main-menu">
                            <div class="list-menu">
                                <div id="logo">
                                    <div class="inner">
                                        <a href="#">
                                            <asp:Image ID="imgLogo" runat="server" ImageUrl="assets/image/logo/Logo_D&N.jpg" AlternateText="Trang Chủ" />
                                        </a>
                                    </div>
                                </div>
                                <div id="search">
                                    <div class="inner">
                                        <form role="search">
                                            <div class="input-button">
                                                <asp:TextBox ID="txtSearch" runat="server" Text="" placeholder="Tìm kiếm sản phẩm" AutoComplete="off"></asp:TextBox>
                                                <asp:Button ID="btnSearch" runat="server" Text="Tìm kiếm" OnClick="btnSearch_Click" />
                                            </div>
                                        </form>
                                    </div>
                                </div>
                                <div id="account">
                                    <div class="inner">
                                        <button type="button">
                                            <i class="fa-solid fa-user pointer"></i>
                                        </button>
                                        <div class="acc">
                                            <asp:Button ID="btnLogin" runat="server" Text="Đăng Nhập" CssClass="pointer" OnClick="btnLogin_Click" />
                                            <span>/</span>
                                            <asp:Button ID="btnRegister" runat="server" Text="Đăng Ký" CssClass="pointer" OnClick="btnRegister_Click" />
                                        </div>
                                    </div>
                                </div>
                                <div id="cart">
                                    <div class="inner">
                                        <div id="icon">
                                            <i class="fa-solid fa-cart-shopping pointer"></i>
                                        </div>
                                        <asp:Button ID="btnCart" runat="server" Text="Giỏ Hàng" CssClass="pointer" OnClick="btnCart_Click" />
                                        <div>
                                            <p>0</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="menu-link">
                            <div class="inner-menu-link">
                                <ul class="items-menu-link">
                                    <li>
                                        <i class="fa-solid fa-eye large"></i>
                                        <a href="#" class="text-a">Sản phẩm đã xem</a>
                                    </li>
                                    <li>
                                        <i class="fa-solid fa-fire large"></i>
                                        <a href="#" class="text-a">Sản phẩm mua nhiều</a>
                                    </li>
                                    <li>
                                        <i class="fa-solid fa-percent large"></i>
                                        <a href="#" class="text-a">Sản phẩm khuyến mãi</a>
                                    </li>
                                    <li>
                                        <i class="fa-solid fa-gift large"></i>
                                        <a href="#" class="text-a">Sản phẩm mới</a>
                                    </li>
                                    <li>
                                        <i class="fa-solid fa-credit-card large"></i>
                                        <a href="#" class="text-a">Hình thức thanh toán</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="item-bottom">
                    <div class="inner container">
                        <div class="nav-link">
                            <asp:Repeater ID="RepeaterCategories" runat="server">
                                <ItemTemplate>
                                    <a href='DanhMuc.aspx?TenDanhMuc=<%# Eval("TenDanhMuc") %>'>
                                        <%# Eval("TenDanhMuc") %>
                                    </a>
                                </ItemTemplate>
                            </asp:Repeater>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        <div>
        </div>

        <footer>
            <div class="inner container">
                <div class="social">
                    <div>
                        <a href="#">
                            <i class="fa-brands fa-square-facebook"></i>
                        </a>
                    </div>
                    <div>
                        <a href="#">
                            <i class="fa-brands fa-square-youtube"></i>
                        </a>
                    </div>
                    <div>
                        <a href="#">
                            <i class="fa-brands fa-square-github"></i>
                        </a>
                    </div>
                </div>
                <div class="content">
                </div>
            </div>
        </footer>
    </form>
</body>
</html>
