using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Threading.Tasks;
using StackApp.Contract;

namespace StackApp.Models
{
    public class ListStack<T> : IStack<T>
    {
        private List<T> _collection;
        private int lastIndex => _collection.Count -1;
        public ListStack()
        {
            _collection = new List<T>();
        }
        public ListStack(IEnumerable<T> collection):this()
        {
            foreach (var item in collection)
            {
                Push(item);
            }
        }
        public T Peek()
        {
            T temp = _collection[lastIndex];
            return temp;
        }

        public T Pop()
        {
            T temp = _collection[lastIndex];
            _collection.Remove(temp);
            return temp;
        }

        public void Push(T item)
        {
            _collection.Add(item);
        }
    }
}