program test2;

class BankAccount
private
    balance: integer;
public
    constructor Create(initialBalance: integer);
    procedure Deposit(amount: integer);
    function GetBalance: integer;
end;

constructor BankAccount.Create(initialBalance: integer);
begin
    balance := initialBalance;
end;

procedure BankAccount.Deposit(amount: integer);
begin
    balance := balance + amount;
end;

function BankAccount.GetBalance: integer;
begin
    GetBalance := balance;
end;

var
    account: BankAccount;
    amount: integer;

begin
    account := new BankAccount(1000);
    writeln("Initial balance: ", account.GetBalance);
    writeln("Enter deposit amount:");
    readln(amount);
    account.Deposit(amount);
    writeln("New balance: ", account.GetBalance);
end.