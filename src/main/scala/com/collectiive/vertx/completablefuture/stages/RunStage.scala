package com.collectiive.vertx.completablefuture.stages

import java.util.concurrent.CompletionStage

import com.collectiive.vertx.completablefuture.VertxCompletableFuture

import scala.concurrent.Future

/**
 * @author suj1th
 */
class RunStage[T](other: CompletionStage[_], action: Runnable) extends VertxCompletableFuture[T] {
  override protected val current: Future[T] = _
}
