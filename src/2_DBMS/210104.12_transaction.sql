-- [ XII ]  Ʈ������ ���ɾ�. COMMIT;  ROLLBACK; SAVEPOINT;
COMMIT; 
SELECT * FROM DEPT01;
DROP TABLE DEPT01;
CREATE TABLE DEPT01
    AS SELECT * FROM DEPT;
SELECT * FROM DEPT01; --10 ~40 �� ����
DELETE FROM DEPT01; --������ ����.
SELECT * FROM DEPT01;
ROLLBACK; -- �ѹ�.  �ϰ� COMMIT �ϸ� ������ ������ �ѹ� �Ұ�.
SELECT * FROM DEPT01;
---���ο� Ʈ������ ����.
DELETE FROM DEPT01 WHERE DEPTNO = 40;
SELECT * FROM DEPT01;
COMMIT;  -- Ŀ��.
--���ο� Ʈ������ ����.
DELETE FROM DEPT01 WHERE DEPTNO =30;
SELECT * FROM DEPT01;  -- 10~20 �� ��Ƴ���.
SAVEPOINT C1;  -- C1 ���� = 10,20�� �μ�.
DELETE FROM DEPT01 WHERE DEPTNO = 20;
SELECT * FROM DEPT01;
SAVEPOINT C2 ; --C2 ���� = 10�� �μ�.
DELETE FROM DEPT01 WHERE DEPTNO = 10;
SELECT * FROM DEPT01; -- ������ ���� ����.
ROLLBACK TO C2;
SELECT * FROM DEPT01 ;
ROLLBACK TO C1;
SELECT * FROM DEPT01; --10,20 �� ��������.
COMMIT;
















































