package cpu

import chisel3._
// import chisel3.util._
// import chisel3.experimental._
// import ALUControl._

class ALU extends RawModule {
  val io = IO(new Bundle {
    val a = Input(UInt(32.W))
    val b = Input(UInt(32.W))
    // val control = Input(ALUControl())
    val out = Output(UInt(32.W))
  })
  io.out := (io.a << io.b) | (io.a >> (32.U(32.W) - io.b))
  // switch(io.control) {
  //   is(ADD) { io.out := io.a + io.b }
  //   is(SUB) { io.out := io.a - io.b }
  //   is(AND) { io.out := io.a & io.b }
  //   is(OR) { io.out := io.a | io.b }
  //   is(XOR) { io.out := io.a ^ io.b }
  //   is(NOT) { io.out := ~io.a }
  //   is(SLL) { io.out := io.a << io.b }
  //   is(SRL) { io.out := io.a >> io.b }
  //   is(SRA) { io.out := io.a >> io.b }
  //   is(ROL) { io.out := (io.a << io.b) | (io.a >> (32.U(32.W) - io.b)) }
  // }
}
