package  chapter2 {

  object ex6 extends App {
    def prod(desc:String) :BigInt ={
      {for (i <- "Hello") yield BigInt(i)}.product
    }

    assert(prod("Hello") == 9415087488L)

  }
}
