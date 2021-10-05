package cz.metait.bmi.demo

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("cz.metait.bmi.demo")
		.start()
}

