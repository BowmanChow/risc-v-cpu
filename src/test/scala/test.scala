package test
import cpu._

object testCPU extends App {
  chisel3.Driver.execute(args, () => new ALU)
}