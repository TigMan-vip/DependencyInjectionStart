package com.example.dependencyinjectionstart.example1

class Component {

	private fun getComputer(): Computer {

		val storage = Storage()
		val processor = Processor()
		val memory = Memory()
		val monitor = Monitor()
		val computerTower = ComputerTower(storage, memory, processor)
		val mouse = Mouse()
		val keyboard = Keyboard()

		return Computer(monitor, computerTower, keyboard, mouse)
	}

	fun inject(activity: Activity) {
		activity.computer  = getComputer()
	}
}