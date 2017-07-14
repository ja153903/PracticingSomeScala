/**
  * Created by Jaime Abbariao on 7/14/2017.
  */
object Run {

  implicit class IntTimes(x:Int){
    // times [A] where [A] is the generic type
    // (f: => A) denotes a nested function that returns type A
    def times [A](f: =>A): Unit ={
      def loop(current: Int): Unit =

        if (current > 0){
          f
          loop(current - 1)
        }
      loop(x)
    }
  }

}
