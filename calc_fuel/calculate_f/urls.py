from django.conf.urls import url
from calculate_f.views import get_result, start


urlpatterns = [
    url(r'^calculate2/$', get_result, name='calc'),
    url(r'^$', start, name='index'),
]
