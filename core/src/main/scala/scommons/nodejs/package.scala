package scommons

package object nodejs {

  type Process = raw.Process
  type URL = raw.URL
  type Stats = raw.Stats
  type PathObject = raw.PathObject
  type Timeout = raw.Timeout

  lazy val path: raw.Path = raw.Path
  lazy val fs: FS = FS
  lazy val os: raw.OS = raw.OS
  lazy val process: Process = raw.NodeJs.process
  
  lazy val global: raw.NodeJs = raw.NodeJs
}