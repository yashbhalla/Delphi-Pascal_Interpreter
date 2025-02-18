program test1;

type
    Person=class
    begin
        private
            name: string;
            age: integer;
        public
            constructor Create(n:string; a:integer);
            procedure PrintInfo;
    end;

constructor Person.Create(n:string; a:integer);
begin
    name:= n;
    age:= a;
end;

procedure Person.PrintInfo;
begin
    writeln("Name: ", name, " Age: ", age);
end;

var
    john: Person;
    age: integer;

begin
    john:= new Person("John Doe", 30);
    john.PrintInfo;
    age:= 25;
    writeln("Age: ", age);
    readln(age);
    writeln("New Age: ", age);
end.