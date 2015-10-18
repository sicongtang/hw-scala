package com.scalaimpatient.ch05_classes.exercise

/**
 * @author BobbyTang
 */
object Ex02 {
  class BankAccount {
    private var balance = 0.0
    def deposit(cash: Double) = balance += cash

    def withdraw(cash: Double) = balance -= cash

    override def toString() = "Balance: " + balance
  }
  
  def main(args: Array[String]): Unit = {
    val account = new BankAccount
    account.deposit(200.50)
    println(account)
    account.withdraw(50.50)
    println(account)
  }
}