#!/usr/bin/python
#-*- coding: utf-8 -*-

#############################
# Nestnet auto attendance script
#############################
import requests
from time import sleep
import sys

##################
# input your data !
user_id = "" 	# your id for nnet.cbnu.ac.kr
password = ""	# your pw for nnet.cbnu.ac.kr
##################

log = """<?xml version="1.0" encoding="utf-8" ?>
<methodCall>
<params>
<_filter>widget_login</_filter>
<error_return_url>/zbxe/index.php</error_return_url>
<mid>renewaled_home</mid>
<user_id>%s</user_id>
<password>%s</password>
<module>member</module>
<act>procMemberLogin</act>
</params>
</methodCall>""" % (user_id, password)

data = """<?xml version="1.0" encoding="utf-8" ?>
<methodCall>
<params>
<_filter>insert_attendance</_filter>
<error_return_url>/zbxe/index.php?mid=renewaled_home</error_return_url>
<mid>renewaled_home</mid>
<greetings>출석했어요</greetings>
<about_position>yes</about_position>
<module>attendance</module>
<act>procAttendanceInsertAttendance</act>
</params>
</methodCall>"""

headers_login = {"Accept": "application/xml, text/xml, */*; q=0.01", "Content-Type": "text/plain", "Referer": "http://nnet.cbnu.ac.kr/zbxe/index.php?mid=renewaled_home", "X-Requested-With": "XMLHttpRequest", "Accept-Language": "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7", "Origin": "http://nnet.cbnu.ac.kr"}
headers_attend = {"Accept": "application/xml, text/xml, */*; q=0.01", "Content-Type": "text/plain", "Referer": "http://nnet.cbnu.ac.kr/zbxe/index.php?mid=renewaled_home", "X-Requested-With": "XMLHttpRequest", "Accept-Language": "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7", "Origin": "http://nnet.cbnu.ac.kr"}

while(True):
	s = requests.session()
	r = s.post("http://nnet.cbnu.ac.kr/zbxe/index.php", data=log, headers=headers_login)
	date = r.headers['Date']
	print date

	if date.find("00:02") != -1:
		r = s.post("http://nnet.cbnu.ac.kr/zbxe/index.php", data=data, headers=headers_attend)
		page = r.text
		date = r.headers['Date']
		print page
		print date
		sys.exit()
