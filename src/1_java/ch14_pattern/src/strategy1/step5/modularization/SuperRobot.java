package strategy1.step5.modularization;

import strategy1.step4.component.FlyYes;
import strategy1.step4.component.KnifeLazer;
import strategy1.step4.component.MissileYes;


//������ �̻��Ͻ���� ��������
public class SuperRobot extends Robot {


	public SuperRobot() {
//������

		setFly(new FlyYes());
		setMissile(new MissileYes());
		setKnife(new KnifeLazer());
		
	

		
		
	}

	@Override
	public void shape() {
		System.out.println("SuperRobot�� ��,�ٸ�,����,�Ӹ����� �̷�����ִ�.");		
	}


}