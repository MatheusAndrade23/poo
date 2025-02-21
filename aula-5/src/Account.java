
public class Account {
  int balance;
  int limit;
  int number;

  String name;

  void withdraw(int amount){
    balance =- amount;
  }
}