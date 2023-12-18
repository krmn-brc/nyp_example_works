using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace StackApp.Models
{
    public class Employee
    {

        public string FirstName { get; set; } = string.Empty;
        public string LastName { get; set; } = string.Empty;
        public double Salary { get; set; }
        public Employee(string firstName, string lastName, double salary)
        {
            FirstName = firstName;
            LastName = lastName;
            Salary = salary;
        }

        // public string FullName { get { return FirstName + " " + LastName; }}
        public string FullName => FirstName + " " + LastName;

        public override string ToString()
        {
            return $"{FullName}: {Salary}";
        }
    }
}