using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace StackApp.Contract
{
    public interface IStack<T>
    {
        void Push(T item);
        T Pop();
        T Peek();
    }
}