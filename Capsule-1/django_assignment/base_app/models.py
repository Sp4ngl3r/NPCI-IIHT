from django.db import models
from django.contrib.auth.models import User
from django.db.models.deletion import CASCADE
from django.db.models.fields import DateTimeField

# Create your models here.


class Task(models.Model):
    user = models.ForeignKey(User, on_delete=CASCADE, null=True, blank=True)
    title = models.CharField(max_length=250)
    description = models.TextField(null=True, blank=True)
    complete = models.BooleanField(default=False)
    created = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return self.title

    class Meta:
        ordering = ['complete']
