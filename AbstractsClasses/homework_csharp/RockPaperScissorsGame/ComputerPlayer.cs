using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RockPaperScissorsGame
{
    public abstract class ComputerPlayer
    {
        protected List<string> _selects = new(){"rock", "paper", "scissors" };
        public string? ComputerName { get; set; }
        public int Point { get; set; } = 0;
        public string? SelectMove { get; set; }
        public virtual void PcMove()
        {
            
        }
       
    }
}