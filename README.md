consul 启动命令 ： consul agent -dev -ui


https://www.cnblogs.com/vianzhang/p/10510271.html

{

  "datacenter": "consul-cluster",

  "node_name": "consul02",

  "bind_addr": "192.168.2.105",

  "client_addr": "192.168.2.105",

  "server": true,

  "bootstrap_expect": 1,

  "data_dir": "/home/wangheng/data/consul/data",

  "http_config": {

    "response_headers": {

      "Access-Control-Allow-Origin": "*"

    }

  },

  "log_level": "INFO",

  "enable_syslog": true,

  "ports": {

    "http": 8500,

    "dns": 8600,

    "serf_lan": 8301,

    "serf_wan": 8302

  },

  "enable_script_checks": true

}

查看成员信息
./consul members --http-addr  http://192.168.2.104:8500