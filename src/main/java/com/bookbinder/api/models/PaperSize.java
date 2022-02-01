package com.bookbinder.api.models;

public enum PaperSize {
    LETTER(612,792),
    NOTE(540,720),
    LEGAL(612,1008),
    TABLOID(792,1224),
    EXECUTIVE(522,756),
    POSTCARD(283,416),
    A0(2384,3370),
    A1(1684,2384),
    A3(842,1191),
    A4(595,842),
    A5(420,595),
    A6(297,420),
	A7(210,297),
    A8(148,210),
    A9(105,148),
    B0(2834,4008),
    B1(2004,2834),
    B2(1417,2004),
	B3(1000,1417),
    B4(708,1000),
    B6(354,498),
    B7(249,354),
    B8(175,249),
    B9(124,175),
	B10(87,124),
    ARCH_E(2592,3456),
    ARCH_C(1296,1728),
    ARCH_B(864,1296),
    ARCH_A(648,864),
	FLSA(612,936),
    FLSE(648,936),
    HALFLETTER(396,612),
    _11X17(792,1224),
    ID_1(242.65,153),
	ID_2(297,210),
    ID_3(354,249),
    LEDGER(1224,792),
    CROWN_QUARTO(535,697),
    LARGE_CROWN_QUARTO(569,731),
	DEMY_QUARTO(620,782),
    ROYAL_QUARTO(671,884),
    CROWN_OCTAVO(348,527),
    LARGE_CROWN_OCTAVO(365,561),
	DEMY_OCTAVO(391,612),
    ROYAL_OCTAVO(442,663),
    SMALL_PAPERBACK(314,504),
	PENGUIN_SMALL_PAPERBACK(314,513),
    PENGUIN_LARGE_PAPERBACK(365,561);

    private final double width;
    private final int height;

    PaperSize(double width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
}
