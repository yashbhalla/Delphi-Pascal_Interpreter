program Test1;

type
    Person = class
    private
        name: string;
        age: integer;
    public
        constructor Create(n: string; a: integer);
        procedure PrintInfo;
    end;

constructor Person.Create(n: string; a: integer);
begin
    name := n;
    age := a;
end;

procedure Person.PrintInfo;
begin
    writeln('Name: ', name, ', Age: ', age);
end;

var
    john: Person;

begin
    john := new Person('John Doe', 30);
    john.PrintInfo;
end.
