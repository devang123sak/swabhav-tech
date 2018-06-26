package com.techlab.isp.violation.test;

import com.techlab.isp.violation.IWorker;
import com.techlab.isp.violation.Manager;
import com.techlab.isp.violation.Robot;

public class WorkerTest {

	public static void main(String[] args) {

		IWorker managerWorker = new Manager();
		IWorker robotWorker = new Robot();

		atTheWorkStation(managerWorker);
		atTheWorkStation(robotWorker);

		atTheCafeteria(managerWorker);
		atTheCafeteria(robotWorker);

	}

	public static void atTheWorkStation(IWorker obj) {
		System.out.println("At The Work Station");
		obj.startWork();
		obj.stopWork();
		System.out.println(" ");
	}

	public static void atTheCafeteria(IWorker obj) {
		System.out.println("At the Cafeteria");
		obj.startEat();
		obj.stopEat();
		System.out.println(" ");
	}

}
