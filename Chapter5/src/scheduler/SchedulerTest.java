package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �� �� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� �� �켱, ���õ� ���� ����");
		
		int ch = System.in.read();
		Scheduler schedular = null;
		
		if ( ch == 'R' || ch == 'r' ) {
			schedular = new RoundRobin();
		} else if ( ch == 'L' || ch == 'l' ) {
			schedular = new LeastJob();
		} else if ( ch == 'P' || ch == 'p' ) {
			schedular = new PriorityAllocation();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		schedular.getNextCall();
		schedular.sendCallToAgent();
		
	}

}
