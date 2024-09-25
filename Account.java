public class Account {
    String accountNumber;
    int balance;
    public String toString() {
        return "¥¥" + this.balance +           //解答がここで改行してあった
          "(口座番号;" + this.accountNumber + ")";
    }
    public boolean equals(Object o) {
        if (this == o) {
           return true;
        } 
        if(o instanceof Account a) {
    //次の2行がわからない
           String an1 = this.accountNumber.trim();  //this.accountNumberのtrimメソッドを呼び出している?
           String an2 = a.accountNumber.trim();
           if (an1.equals(an2)) {  //文字列の比較
            return true;           //文字列型の変数.equals(比較相手の文字列)
           }
        }
        return false;
    }
}