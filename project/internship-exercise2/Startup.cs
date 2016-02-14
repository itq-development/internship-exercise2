using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(internship_exercise2.Startup))]
namespace internship_exercise2
{
    public class Startup
    {
        public void Configuration(IAppBuilder app)
        {
        }
    }
}
