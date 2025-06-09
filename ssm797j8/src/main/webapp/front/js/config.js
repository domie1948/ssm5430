
var projectName = '小区物业管理与疫情防控系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '疫情防护',
	url: './pages/yiqingfanghu/list.html'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.html'
}, 
{
	name: '公告信息',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssm797j8/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","打印","导出"],"menu":"业主","menuJump":"列表","tableName":"yezhu"}],"menu":"业主管理"},{"child":[{"buttons":["新增","查看","修改","删除","打印","导出"],"menu":"物业","menuJump":"列表","tableName":"wuye"}],"menu":"物业管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"疫情防护","menuJump":"列表","tableName":"yiqingfanghu"}],"menu":"疫情防护管理"},{"child":[{"buttons":["查看","修改","删除","审核","导出"],"menu":"业主上报","menuJump":"列表","tableName":"yezhushangbao"}],"menu":"业主上报管理"},{"child":[{"buttons":["查看","修改","删除","审核","导出"],"menu":"可疑上报","menuJump":"列表","tableName":"keyishangbao"}],"menu":"可疑上报管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"疫情防护列表","menuJump":"列表","tableName":"yiqingfanghu"}],"menu":"疫情防护模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"业主上报","menuJump":"列表","tableName":"yezhushangbao"}],"menu":"业主上报管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"疫情防护列表","menuJump":"列表","tableName":"yiqingfanghu"}],"menu":"疫情防护模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"业主","tableName":"yezhu"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"业主","menuJump":"列表","tableName":"yezhu"}],"menu":"业主管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"可疑上报","menuJump":"列表","tableName":"keyishangbao"}],"menu":"可疑上报管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"疫情防护列表","menuJump":"列表","tableName":"yiqingfanghu"}],"menu":"疫情防护模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"物业","tableName":"wuye"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
