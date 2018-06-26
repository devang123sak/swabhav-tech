package com.techlab.isp.refactor.test;

import com.techlab.isp.refactor.IEat;
import com.techlab.isp.refactor.IWork;
import com.techlab.isp.refactor.IWorkAndEat;
import com.techlab.isp.refactor.Manager;
import com.techlab.isp.refactor.Robot;

public class WorkerTest {

	public static void main(String[] args) {

		IWorkAndEat managerWorker = new Manager();
		IWork robotWorker = new Robot();

		atTheWorkStation(managerWorker);
		atTheWorkStation(robotWorker);

		atTheCafeteria(managerWorker);

	}

	public static void atTheWorkStation(IWork obj) {
		System.out.println("At The Work Station");
		obj.startWork();
		obj.stopWork();
		System.out.println(" ");
	}

	public static void atTheCafeteria(IEat obj) {
		System.out.println("At the Cafeteria");
		obj.startEat();
		obj.stopEat();
		System.out.println(" ");
	}

}
