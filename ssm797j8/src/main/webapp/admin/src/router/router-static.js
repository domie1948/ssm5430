import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import yezhu from '@/views/modules/yezhu/list'
    import keyishangbao from '@/views/modules/keyishangbao/list'
    import chat from '@/views/modules/chat/list'
    import yezhushangbao from '@/views/modules/yezhushangbao/list'
    import storeup from '@/views/modules/storeup/list'
    import wuye from '@/views/modules/wuye/list'
    import config from '@/views/modules/config/list'
    import yiqingfanghu from '@/views/modules/yiqingfanghu/list'
    import users from '@/views/modules/users/list'
    import discussyiqingfanghu from '@/views/modules/discussyiqingfanghu/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
          ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
          ,{
	path: '/yezhu',
        name: '业主',
        component: yezhu
      }
          ,{
	path: '/keyishangbao',
        name: '可疑上报',
        component: keyishangbao
      }
          ,{
	path: '/chat',
        name: '客服管理',
        component: chat
      }
          ,{
	path: '/yezhushangbao',
        name: '业主上报',
        component: yezhushangbao
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/wuye',
        name: '物业',
        component: wuye
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/yiqingfanghu',
        name: '疫情防护',
        component: yiqingfanghu
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/discussyiqingfanghu',
        name: '疫情防护评论',
        component: discussyiqingfanghu
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
