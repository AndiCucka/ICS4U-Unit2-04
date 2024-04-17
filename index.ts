/**
 * This is the standard index.ts starting point.
 *
 * author  Andi Cucka
 * version 1.0
 * since   2024-03-19
 */
import { CarStack } from './CarStack'

let fruits = new CarStack()
fruits.push("watermelon")
fruits.push("banana")
fruits.push("raspberry")
console.log("fruits: " + fruits.showStack)
console.log("peak: " + fruits.peak)
console.log("popped: " + fruits.popItem())
console.log("fruits: " + fruits.showStack)
fruits.clear()
console.log("Clearing stack...")
console.log("fruits: " + fruits.showStack)
console.log("")

let colors = new CarStack()
colors.push("red")
colors.push("green")
colors.push("blue")
console.log("colors: " + colors.showStack)
console.log("peak: " + colors.peak)
console.log("popped: " + colors.popItem())
console.log("popped: " + colors.popItem())
console.log("peak: " + colors.peak)
console.log("colors: " + colors.showStack)
colors.clear()
console.log("Clearing stack...")
console.log("colors: " + colors.showStack)
console.log("")

let cars = new CarStack()
cars.push("square")
cars.push("triangle")
cars.push("circle")
console.log("cars: " + cars.showStack)
console.log("peak: " + cars.peak)
cars.clear()
console.log("Clearing stack...")
console.log("cars: " + cars.showStack)
console.log("peak: " + cars.peak)
console.log("")

console.log("\nDone.")
