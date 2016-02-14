using System.Web.Mvc;
using internship_exercise2.Models;

namespace internship_exercise2.Controllers
{
    public class HomeController : Controller
    {
        private readonly IFuelConsumptionService _service;

        public HomeController(IFuelConsumptionService service)
        {
            _service = service;
        }

        [HttpGet]
        public ActionResult Index()
        {
            return View();
        }
        
        [HttpPost]
        public ActionResult Index(Car model)
        {
            if (!ModelState.IsValid)
            {
                return PartialView("ErrorPartial");
            }
            var result = _service.Calculate(model);
            return PartialView("ResultPartial", result);
        }
    }
}