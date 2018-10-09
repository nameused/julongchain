聚龙链特性列表<br/>

JulongChain V0.8<br/>
2018.09.27
<ul>
<li>1、完整的区块链组网：Node节点、Consenter节点、CA节点等。</li>
<li>2、提供命令行支持：启动节点、创建群组、加入群组、列出群组、查看群组链信息、安装智能合约、实例化智能合约、调用智能合约、查询智能合约等。</li>
<li>3、Node节点实现模拟执行交易、背书、验证、提交账本等核心业务逻辑。</li>
<li>4、Consenter节点实现广播、投递、排序、切块等核心业务逻辑。</li>
<li>5、实现国密算法SM2/SM3/SM4在聚龙链的集成和应用。</li>
<li>6、集成国密CA系统，使用国密CA签发、认证、管理各节点及客户程序的身份证书。</li>
<li>7、实现配置系统智能合约、生命周期管理系统智能合约、背书系统智能合约、查询系统智能合约、验证系统智能合约等系统智能合约。</li>
<li>8、内置智能合约容器，支持可编程的智能合约，提供编译、打包、安装、实例化、调用、查询智能合约等功能。</li>
<li>9、具备完整的成员身份管理体系，管理参与者的身份证书、数字签名、验证算法以及身份合法性规则。</li>
<li>10、完善的容器化支持，支持以容器的形式部署聚龙链平台各部件。</li>
<li>11、完整的标准区块链存储结构和账本存取功能，完成状态数据库、索引数据库、历史数据库等KV数据库。</li>
<li>12、提供密码生成工具、交易生成工具等便捷工具。</li>
<li>13、更多组件信息如下：</li>
</ul>
<table border="1">
  <tr>
    <th>组件名</th>
    <th>组件描述</th>
    <th>开发单位</th>
    <th>版本状态</th>
  </tr>
  <tr>
     <td>Node前端</td>    
     <td>命令行支持，包括对节点、群组、智能合约等操作的命令行</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>Node后端</td>    
     <td>Node节点提供的背书、提交、管理等后台核心服务</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>密码服务提供者</td>    
     <td>密码模块框架、可拔插的密码算法接口</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>成员身份管理</td>    
     <td>身份证书管理、识别、认证、合法性规则等</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>Consenter</td>    
     <td>共识节点，包含广播、投递、排序、切块等核心业务实现</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>系统智能合约</td>    
     <td>配置、生命周期、背书、查询、验证等系统智能合约</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>智能合约支持服务</td>    
     <td>与智能合约容器进行交互，辅助智能合约完成账本操作等功能</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>智能合约容器管理</td>    
     <td>编译、打包、安装、实例化智能合约，管理智能合约容器等</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>账本服务</td>    
     <td>区块链文件系统、状态数据库、历史数据库、索引数据库等</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>权限管理器</td>    
     <td>权限配置、管理、访问清单列表等</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>配置管理</td>    
     <td>群组、资源等定制化配置信息</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>交易验证器</td>    
     <td>交易验证、消息验证等</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>公共支撑模块</td>    
     <td>Proto对象操作、日志、常用工具等</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>交易生成工具</td>    
     <td>可生成交易需要的配置、创世区块等结构信息</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>聚龙链网络搭建脚本</td>    
     <td>搭建聚龙链网络所需要的自动化部署脚本</td>
     <td>鼎铉</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>国密算法软实现</td>    
     <td>使用软算法实现的国密算法</td>
     <td>兴唐通讯</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>密码生成工具</td>    
     <td>组织结构、国密证书等文件及目录生成</td>
     <td>文鼎创</td>
     <td>已实现，已集成</td>
   </tr>
  <tr>
     <td>SZCA</td>    
     <td>深圳CA为聚龙链打造的CA组件，为证书签发中心</td>
     <td>深圳CA</td>
     <td>已实现，未集成</td>
  </tr>
  <tr>
     <td>CFCA</td>    
     <td>CFCA为聚龙链提供CA前端代理服务，通过第三方RA/CA实现CA的功能</td>
     <td>CFCA</td>
     <td>已实现，未集成</td>
  </tr>  
  <tr>
     <td>Kafka组件</td>    
     <td>Kafka排序共识插件</td>
     <td>北京数盾</td>
     <td>已实现，未集成</td>
   </tr>
  <tr>
     <td>策略检查</td>    
     <td>背书、执行合约等策略检查</td>
     <td>航天信息</td>
     <td>已实现，未集成</td>
   </tr>
   <tr>
     <td>CouchDB</td>    
     <td>替代状态数据库的KV数据库组件</td>
     <td>格尔软件</td>
     <td>已实现，未集成</td>
   </tr>
   <tr>
     <td>SDK</td>    
     <td>提供给区块链应用开发者的API</td>
     <td>飞天诚信</td>
     <td>已实现，未集成</td>
   </tr>
   <tr>
     <td>国密SSL</td>    
     <td>提供国密领域的SSL传输加密</td>
     <td>信安世纪</td>
     <td>已实现，未集成</td>
   </tr>
   <tr>
     <td>GMT0016</td>    
     <td>提供GMT0016加密标准的算法实现</td>
     <td>文鼎创</td>
     <td>已实现，未集成</td>
   </tr>
   <tr>
     <td>GMT0016</td>    
     <td>提供GMT0016加密标准的算法实现</td>
     <td>飞天诚信</td>
     <td>已实现，未集成</td>
   </tr>
    
</table>