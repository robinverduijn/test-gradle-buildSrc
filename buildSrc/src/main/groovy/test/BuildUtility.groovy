package test

import java.util.logging.Logger

class BuildUtility {
  Logger logger = Logger.getLogger( 'BuildUtility' )

  def doSomething() {
    logger.warning( '==> BuildUtility: doSomething()' )
  }
}
