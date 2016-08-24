package com.collectiive.vertx.completablefuture

import java.util.concurrent.{CompletionStage, CompletableFuture}
import java.util.function.{BiFunction, Consumer, BiConsumer, Function}

import scala.concurrent.Future

/**
 * @author suj1th
 */
class VertxCompletableFuture[T] extends CompletableFuture[T] with CompletionStage[T]{

  private val dependents =  Array.empty[VertxCompletableFuture]
  protected val current : Future[T] = ???

  override def runAfterEitherAsync(other: CompletionStage[_], action: Runnable): CompletionStage[Void] = ???

  override def thenCombineAsync[U, V](other: CompletionStage[_ <: U], fn: BiFunction[_ >: T, _ >: U, _ <: V]): CompletionStage[V] = ???

  override def handleAsync[U](fn: BiFunction[_ >: T, Throwable, _ <: U]): CompletionStage[U] = ???

  override def thenComposeAsync[U](fn: Function[_ >: T, _ <: CompletionStage[U]]): CompletionStage[U] = ???

  override def runAfterBothAsync(other: CompletionStage[_], action: Runnable): CompletionStage[Void] = ???

  override def thenRunAsync(action: Runnable): CompletionStage[Void] = ???

  override def thenAcceptAsync(action: Consumer[_ >: T]): CompletionStage[Void] = ???

  override def thenAcceptBothAsync[U](other: CompletionStage[_ <: U], action: BiConsumer[_ >: T, _ >: U]): CompletionStage[Void] = ???

  override def acceptEitherAsync(other: CompletionStage[_ <: T], action: Consumer[_ >: T]): CompletionStage[Void] = ???

  override def whenCompleteAsync(action: BiConsumer[_ >: T, _ >: Throwable]): CompletionStage[T] = ???

  override def applyToEitherAsync[U](other: CompletionStage[_ <: T], fn: Function[_ >: T, U]): CompletionStage[U] = ???

  override def thenApplyAsync[U](fn: Function[_ >: T, _ <: U]): CompletionStage[U] = ???
}

object VertxCompletableFuture
