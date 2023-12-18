// See https://aka.ms/new-console-template for more information
using StackApp.Models;

Console.WriteLine("");
var numbers = new int[]{1, 20, 12, 32};
var stack_numbers = new StackApp.Models.Stack<int>(numbers);
System.Console.WriteLine(stack_numbers.Peek());
var cities = new List<string>()
{
    "Ankara", "Bolu", "İstanbul", "Giresun"
};
StackApp.Models.Stack<string> listStack = new StackApp.Models.Stack<string>(cities);
System.Console.WriteLine(listStack.Peek());

