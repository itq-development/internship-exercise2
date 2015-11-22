from django.shortcuts import render
from calculate_f.models import Calculator


def start(request):
    return render(request, 'calculate_f/index.html')


def get_result(request):
    result = Calculator()
    a=result.calculate(request.POST.get('region', ''), float(request.POST.get('fuel', '')), float(request.POST.get('journey_driven', '')) )
    return render(request, 'calculate_f/result.html', {'result': a, 'region':request.POST.get('region', '')})