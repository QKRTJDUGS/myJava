SQL> select *
  2  from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
BONUS                          TABLE                                            
DEPT                           TABLE                                            
EMP                            TABLE                                            
SALGRADE                       TABLE                                            

SQL> select ename, job, sal
  2  from emp;

ENAME      JOB              SAL                                                 
---------- --------- ----------                                                 
SMITH      CLERK            800                                                 
ALLEN      SALESMAN        1600                                                 
WARD       SALESMAN        1250                                                 
JONES      MANAGER         2975                                                 
MARTIN     SALESMAN        1250                                                 
BLAKE      MANAGER         2850                                                 
CLARK      MANAGER         2450                                                 
SCOTT      ANALYST         3000                                                 
KING       PRESIDENT       5000                                                 
TURNER     SALESMAN        1500                                                 
ADAMS      CLERK           1100                                                 

ENAME      JOB              SAL                                                 
---------- --------- ----------                                                 
JAMES      CLERK            950                                                 
FORD       ANALYST         3000                                                 
MILLER     CLERK           1300                                                 

14 개의 행이 선택되었습니다.

SQL> desc dept
 이름                                      널?      유형
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                    NOT NULL NUMBER(2)
 DNAME                                              VARCHAR2(14)
 LOC                                                VARCHAR2(13)

SQL> SPOOL OFF;
