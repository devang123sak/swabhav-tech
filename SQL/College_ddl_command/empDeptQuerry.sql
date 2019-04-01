CREATE TABLE DEPT (
 DEPTNO              integer NOT NULL,
 DNAME               varchar(14),
 LOC                 varchar(13),
 CONSTRAINT DEPT_PRIMARY_KEY PRIMARY KEY (DEPTNO));
  select * FROM DEPT;
  INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');


CREATE TABLE EMP (
 EMPNO               integer NOT NULL,
 ENAME               varchar(10),
 JOB                 varchar(9),
 MGR                 integer CONSTRAINT EMP_SELF_KEY REFERENCES EMP (EMPNO),
 HIREDATE            DATEtime,
 SAL                 money,
 COMM                money,
 DEPTNO              integer NOT NULL,
 CONSTRAINT EMP_FOREIGN_KEY FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO),
 CONSTRAINT EMP_PRIMARY_KEY PRIMARY KEY (EMPNO));

   select * FROM EMP;

   INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'17-NOV-81',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'1-MAY-81',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'9-JUN-81',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'2-APR-81',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'28-SEP-81',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'20-FEB-81',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'8-SEP-81',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'3-DEC-81',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'22-FEB-81',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'3-DEC-81',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'17-DEC-80',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'09-DEC-82',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'12-JAN-83',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'23-JAN-82',1300,NULL,10);

select*from dept;
select*from EMP;

--display Emp names
SELECT ENAME from EMP ;

--display Emp name in Lower case
SELECT LOWER(ENAME) FROM EMP;

--display Emp name in ascending order
SELECT ENAME FROM EMP  ORDER BY ENAME ASC;

--display Emp name in discending order
SELECT ENAME FROM EMP  ORDER BY ENAME DESC;

--display dep no from emp
SELECT DEPTNO FROM EMP;

--display unique dept no from emp
SELECT distinct DEPTNO FROM EMP ;

--display ename,salary of 'KING'
SELECT ENAME,SAL FROM EMP WHERE ENAME='KING'; 

--display emp name in dept 10
SELECT * FROM EMP WHERE DEPTNO=10;

--display all emp where name start with s
SELECT ENAME FROM EMP WHERE ENAME LIKE 'S%';

--display all emp where name end with n
SELECT ENAME FROM EMP WHERE ENAME LIKE '%N';

-- display all emp whose commission null
SELECT * FROM EMP WHERE COMM IS NULL;

--display all  emp dept 10 & 20
SELECT * FROM EMP WHERE DEPTNO=10 OR DEPTNO=20;

--display salary,commission,ctc(salary+commission) of all emp
SELECT SAL,COMM,(SAL+COMM)  FROM EMP ;

--display all emp who are CLARK
SELECT * FROM EMP WHERE JOB='CLERK';

--display current date
SELECT GETDATE();

--display all emp who are 'ANALYST' & 'MANAGER'
SELECT * FROM EMP WHERE JOB='ANALYST' or JOB='MANAGER';
SELECT * FROM EMP WHERE JOB IN ('ANALYST', 'MANAGER');

--display joining date & experience


--display emp whose work in same dept of smith
SELECT * FROM EMP WHERE DEPTNO=(SELECT DEPTNO FROM EMP WHERE ENAME='SMITH');

--display emp whose has same salary of scott
SELECT * FROM EMP WHERE SAL=(SELECT SAL FROM EMP WHERE ENAME='SCOTT');

--display emp who has same designation of blake
SELECT * FROM EMP WHERE JOB=(SELECT JOB FROM EMP WHERE ENAME='BLAKE');

--display sum of salary and avg salary and count of emp number
SELECT AVG(SAL), COUNT(EMPNO),SUM(SAL) FROM EMP;

--display dept wise number of emp count 
SELECT DEPTNO , COUNT (EMPNO)AS TOTOL_EMP FROM EMP GROUP BY DEPTNO;
 
--display job wise number of emp count
SELECT JOB , COUNT (JOB)AS TOTOL_EMP FROM EMP GROUP BY JOB;

--display which dept has max number of emp

--display select top 3 salary emp
SELECT TOP (3) SAL FROM EMP ORDER BY SAL DESC;


--display inner join 
SELECT ENAME,DNAME
FROM EMP 
INNER JOIN DEPT 
ON EMP.DEPTNO=DEPT.DEPTNO;

--DISPLAY DEPARTMENT WISE COUNT USING INNER JOIN
SELECT DNAME,COUNT(EMPNO)AS COUNT
FROM EMP 
INNER JOIN DEPT
ON EMP.DEPTNO=DEPT.DEPTNO
GROUP BY DNAME; 

--DISPLAY EMP NAME WITH BOSSNAME
SELECT X.ENAME AS NAME, Y.ENAME AS BOSSNAME 
FROM EMP AS X
INNER JOIN EMP AS Y
ON X.MGR=Y.EMPNO ;

--DISPLAY NME,BOSSNAME AND DNAME(USING TWO INNER JOIN)
SELECT X.ENAME , Y.ENAME, DNAME 
FROM EMP AS X
INNER JOIN EMP AS Y
ON X.MGR=Y.EMPNO
INNER JOIN DEPT ON X.DEPTNO=DEPT.DEPTNO;

--DISPLAY ALL DEPT WISE EMP NAME USING OUTER JOIN 
SELECT * FROM EMP  
FULL OUTER JOIN DEPT
ON EMP.DEPTNO=DEPT.DEPTNO;

--DISPLAY EMP NAME HAVING NULL VALUE USING OUTER JOIN
SELECT * FROM EMP  
FULL OUTER JOIN DEPT
ON EMP.DEPTNO=DEPT.DEPTNO;

--DISPLAY COUNRTY NAME REGION NAME LOCATION NAME
--REGION WISE NUMBER OF COUNTRY(EACH REGION HAS HOW MANY COUNTRY)
--REGION THE WHICH DOES'T HAVE COUNTRY
--DISAPLY THE COUNTRY WHICH DOES NOT HAVE LOCATION.
 
