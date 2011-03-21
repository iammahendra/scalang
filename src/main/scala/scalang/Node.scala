package scalang

import java.util.concurrent.atomic._
import java.net.InetSocketAddress
import java.util.concurrent.Executors
import org.jboss.{netty => netty}
import netty.channel._
import netty.bootstrap._
import socket.nio.NioServerSocketChannelFactory

object Node {
  def apply() {
    
  }
}

trait Node {
  def createProcess(process : Process) : Pid
  def createProcess(regName : String, process : Process) : Pid
  def registerName(regName : String, pid : Pid)
  def getNames : Seq[String]
  def whereis(name : String) : Option[Pid]
  def ping(node : String, timeout : Long)
  def nodes : Seq[String]
}

/*class ErlangNode(val name : String, val host : String, val cookie : String) extends Node {

}*/

