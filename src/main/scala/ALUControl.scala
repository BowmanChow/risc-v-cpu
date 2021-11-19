package cpu

import chisel3._
import chisel3.util._
import chisel3.experimental._

object ALUControl extends ChiselEnum {
  val ADD, SUB, AND, OR, XOR, NOT, SLL, SRL, SRA, ROL = Value
}
