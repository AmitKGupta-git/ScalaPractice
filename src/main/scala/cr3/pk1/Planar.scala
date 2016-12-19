package cr3.pk1

/**
  * Created by Amit on 12/18/16.
  */
trait Planar {
  def height: Int
  def width: Int
  def surface: Int = height * width
}
