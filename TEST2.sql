DROP DATABASE IF EXISTS WAREHOUE_FIVE;
CREATE DATABASE IF NOT EXISTS WAREHOUSE_FIVE;
USE WAREHOUSE_FIVE;

/*DROP TABLE IF EXISTS NHACC;
CREATE TABLE IF NOT EXISTS NHACC
(
	MANHACC	SMALLINT NOT NULL,
    TENNHACC	VARCHAR(30) NOT NULL,
    DIACHI	VARCHAR(30)	NOT NULL,
    DT	CHAR(10)	NOT NULL,
    PRIMARY KEY(MANHACC)
);

DROP TABLE IF EXISTS VATTU;
CREATE TABLE IF NOT EXISTS VATTU
(
	MAVTU	SMALLINT	NOT NULL,
    TENVTU	VARCHAR(10)	NOT NULL,
    DVTINH	VARCHAR(10)	NOT NULL,
    PHANTRAM	REAL	NOT NULL,
    PRIMARY KEY(MAVTU)
);

DROP TABLE IF EXISTS CTPXUAT;
CREATE TABLE IF NOT EXISTS CTPXUAT
(
	SOPX	SMALLINT 	NOT NULL,
    MAVTU	SMALLINT	NOT NULL,
    SLXUAT	SMALLINT	NOT NULL,
    DGXUAT	REAL		NOT NULL,
    PRIMARY KEY(SOPX),
    FOREIGN KEY(MAVTU) REFERENCES VATTU(MAVTU)
);

DROP TABLE IF EXISTS PXUAT;
CREATE TABLE IF NOT EXISTS PXUAT
(
	SOPX	SMALLINT		NOT NULL	UNIQUE,
    NGAYXUAT	DATETIME	NOT NULL,
    TENKH	VARCHAR(30)		NOT NULL,
    FOREIGN KEY (SOPX) REFERENCES CTPXUAT(SOPX)
);



DROP TABLE IF EXISTS TONKHO;
CREATE TABLE IF NOT EXISTS TONKHO
(
	NAMTHANG	DATETIME	NOT NULL,
    MAVTU		SMALLINT	NOT NULL,
    SLDAU		SMALLINT	NOT NULL,
    TONGSLN		SMALLINT 	NOT NULL,
    TONGSLX		SMALLINT	NOT NULL,
    SLCUOI		SMALLINT	NOT NULL,
    PRIMARY KEY(NAMTHANG),
    FOREIGN KEY(MAVTU) REFERENCES VATTU(MAVTU)
);

DROP TABLE IF EXISTS CTDONDH;
CREATE TABLE IF NOT EXISTS CTDONDH
(
	SODH	SMALLINT	NOT NULL,
    MAVTU	SMALLINT	NOT NULL,
    SLDAT	SMALLINT	NOT NULL,
    PRIMARY KEY(SODH),
    FOREIGN KEY(MAVTU) REFERENCES	VATTU(MAVTU)
);

DROP TABLE IF EXISTS DONDH;
CREATE TABLE IF NOT EXISTS DONDH
(
	SODH	SMALLINT	NOT NULL	UNIQUE,
    NGAYDH	DATETIME	NOT NULL,
    MANHACC	SMALLINT	NOT NULL,
    FOREIGN KEY(SODH) REFERENCES CTDONDH(SODH),
    FOREIGN KEY(MANHACC)REFERENCES	NHACC(MANHACC)
);

DROP TABLE IF EXISTS CTPNHAP;
CREATE TABLE IF NOT EXISTS CTPNHAP
(
	SOPN	SMALLINT	NOT NULL,
    MAVTU	SMALLINT	NOT NULL,
    SLNHAP	SMALLINT	NOT NULL,
    DGNHAP	REAL		NOT NULL,
    PRIMARY KEY(SOPN),
    FOREIGN KEY(MAVTU)	REFERENCES	VATTU(MAVTU)
);

DROP TABLE IF EXISTS PNHAP;
CREATE TABLE IF NOT EXISTS PNHAP
(
	SOPN	SMALLINT	NOT NULL	UNIQUE,
    NGAYNHAP	DATETIME	NOT NULL,
    SODH	SMALLINT NOT NULL,
    FOREIGN KEY(SOPN) REFERENCES CTPNHAP(SOPN),
    FOREIGN KEY(SODH) REFERENCES  DONDH(SODH)
);
*/

/*2*/


DROP PROCEDURE IF EXISTS SLCUOI;

DELIMITER $$
CREATE PROCEDURE SLCUOI(IN MAVATTU SMALLINT)
BEGIN
	
    SELECT SLCUOI
    FROM TONKHO
    WHERE MAVTU=MAVATTU;

END $$
DELIMITER ;

CALL SLCUOI();

 /*3*/

DROP PROCEDURE IF EXISTS TONG_TIEN_XUAT;

DELIMITER $$
CREATE PROCEDURE TONG_TIEN_XUAT(IN MAVATTU SMALLINT)
BEGIN
	
    SELECT TK.MAVTU, TK.TONGSLX, CTPX.DGXUAT, (TK.TONGSL*CTPX.DGXUAT) AS TONGTIENXUAT
    FROM TONKHO TK
    JOIN VATTU VT ON TK.MAVTU=VT.MAVTU
    JOIN CTPXUAT CTPX ON VT.MAVTU=CTPX.MAVTU
    WHERE TK.MAVTU = MAVATTU;
    
END$$
DELIMITER ;

CALL TONG_TIEN_XUAT();

/*4*/

DROP PROCEDURE IF EXISTS TONG_SO_LUONG_DAT;

DELIMITER $$
CREATE PROCEDURE TONG_SO_LUONG_DAT(IN IN_SODH SMALLINT)
BEGIN
	
    SELECT SLDAT
    FROM CTDONDH
    WHERE SODH=IN_SODH;
    
END $$
DELIMITER ;

CALL TONG_SO_LUONG_DAT(); 

/*5*/

DROP PROCEDURE IF EXISTS THEM_DON_DH;

DELIMITER $$
CREATE PROCEDURE THEM_DON_DH(IN IN_SODH SMALLINT,IN IN_MAVTU SMALLINT,IN IN_SLDAT SMALLINT)
BEGIN
	
    INSERT INTO CTDONDH( SODH, MAVTU, SLDAT)
    VALUES             (@SODH,@MAVTU,@SLDAT);
    
END $$
DELIMITER ;

CALL THEM_DON_DH();

/*6*/

DROP PROCEDURE THEM;

DELIMITER $$
CREATE PROCEDURE THEM()
BEGIN

	ALTER TABLE DONDH
    ADD COLUMN CHITIET VARCHAR(20) AFTER MANHACC;

END $$
DELIMITER ;

CALL THEM();






    