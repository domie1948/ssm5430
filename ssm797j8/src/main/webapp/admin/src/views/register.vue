<template>
  <div>
    <div class="container">
      <div class="login-form" style="backgroundColor:rgba(255,255,255,.5);borderRadius:20px">
        <h1 class="h1" style="color:#000;fontSize:26px;">小区物业管理与疫情防控系统注册</h1>
		<el-form ref="rgsForm" class="rgs-form" :model="rgsForm" label-width="120px">
															<!-- <div v-if="tableName=='yezhu'" class="input-group">
			   <div class="label">用户名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yonghuming" class="input" type="text" placeholder="用户名">
			   </div>
			 </div> -->
			<el-form-item label="用户名" class="input" v-if="tableName=='yezhu'">
			  <el-input v-model="ruleForm.yonghuming" autocomplete="off" placeholder="用户名" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yezhu'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='yezhu'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yezhu'" class="input-group">
			   <div class="label">姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.xingming" class="input" type="text" placeholder="姓名">
			   </div>
			 </div> -->
			<el-form-item label="姓名" class="input" v-if="tableName=='yezhu'">
			  <el-input v-model="ruleForm.xingming" autocomplete="off" placeholder="姓名" type="text" />
			</el-form-item>
																														<!-- <div v-if="tableName=='yezhu'" class="input-group">
			   <div class="label">楼号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.louhao" class="input" type="text" placeholder="楼号">
			   </div>
			 </div> -->
			<el-form-item label="楼号" class="input" v-if="tableName=='yezhu'">
			  <el-input v-model="ruleForm.louhao" autocomplete="off" placeholder="楼号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yezhu'" class="input-group">
			   <div class="label">房号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.fanghao" class="input" type="text" placeholder="房号">
			   </div>
			 </div> -->
			<el-form-item label="房号" class="input" v-if="tableName=='yezhu'">
			  <el-input v-model="ruleForm.fanghao" autocomplete="off" placeholder="房号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yezhu'" class="input-group">
			   <div class="label">手机</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shouji" class="input" type="text" placeholder="手机">
			   </div>
			 </div> -->
			<el-form-item label="手机" class="input" v-if="tableName=='yezhu'">
			  <el-input v-model="ruleForm.shouji" autocomplete="off" placeholder="手机" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yezhu'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='yezhu'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱" type="text" />
			</el-form-item>
																								<!-- <div v-if="tableName=='wuye'" class="input-group">
			   <div class="label">物业工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.wuyegonghao" class="input" type="text" placeholder="物业工号">
			   </div>
			 </div> -->
			<el-form-item label="物业工号" class="input" v-if="tableName=='wuye'">
			  <el-input v-model="ruleForm.wuyegonghao" autocomplete="off" placeholder="物业工号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='wuye'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='wuye'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='wuye'" class="input-group">
			   <div class="label">物业姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.wuyexingming" class="input" type="text" placeholder="物业姓名">
			   </div>
			 </div> -->
			<el-form-item label="物业姓名" class="input" v-if="tableName=='wuye'">
			  <el-input v-model="ruleForm.wuyexingming" autocomplete="off" placeholder="物业姓名" type="text" />
			</el-form-item>
																														<!-- <div v-if="tableName=='wuye'" class="input-group">
			   <div class="label">职位</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhiwei" class="input" type="text" placeholder="职位">
			   </div>
			 </div> -->
			<el-form-item label="职位" class="input" v-if="tableName=='wuye'">
			  <el-input v-model="ruleForm.zhiwei" autocomplete="off" placeholder="职位" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='wuye'" class="input-group">
			   <div class="label">联系电话</div>
			   <div class="input-container">
			     <input v-model="ruleForm.lianxidianhua" class="input" type="text" placeholder="联系电话">
			   </div>
			 </div> -->
			<el-form-item label="联系电话" class="input" v-if="tableName=='wuye'">
			  <el-input v-model="ruleForm.lianxidianhua" autocomplete="off" placeholder="联系电话" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='wuye'" class="input-group">
			   <div class="label">家庭住址</div>
			   <div class="input-container">
			     <input v-model="ruleForm.jiatingzhuzhi" class="input" type="text" placeholder="家庭住址">
			   </div>
			 </div> -->
			<el-form-item label="家庭住址" class="input" v-if="tableName=='wuye'">
			  <el-input v-model="ruleForm.jiatingzhuzhi" autocomplete="off" placeholder="家庭住址" type="text" />
			</el-form-item>
																																																															<el-button class="btn" type="primary" @click="login()">注册</el-button>
		</el-form>
      </div>
      <!-- <div class="nk-navigation">
        <a href="#">
          <div @click="login()">注册</div>
        </a>
      </div> -->
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      ruleForm: {
              },
      tableName:"",
      rules: {}
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 注册
    login() {
                              if((!this.ruleForm.yonghuming) && `yezhu` == this.tableName){
        this.$message.error(`用户名不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `yezhu` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.xingming) && `yezhu` == this.tableName){
        this.$message.error(`姓名不能为空`);
        return
      }
                                                                                                                                                                                                                                                                                                                  if(`yezhu` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
                                                                        if(`yezhu` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
                                                            if((!this.ruleForm.wuyegonghao) && `wuye` == this.tableName){
        this.$message.error(`物业工号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `wuye` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.wuyexingming) && `wuye` == this.tableName){
        this.$message.error(`物业姓名不能为空`);
        return
      }
                                                                                                                                                                                                                                                            if(`wuye` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入手机格式`);
        return
      }
                                                                                                                                                                                                      this.$http({
        url: `${this.tableName}/register`,
        method: "post",
        data:this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "注册成功",
            type: "success",
            duration: 1500,
            onClose: () => {
              this.$router.replace({ path: "/login" });
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.h1 {
		margin-top: 10px;
	}

	body {
		padding: 0;
		margin: 0;
	}

	// .container {
 //    min-height: 100vh;
 //    text-align: center;
 //    // background-color: #00c292;
 //    padding-top: 20vh;
 //    background-image: url(../assets/img/bg.jpg);
 //    background-size: 100% 100%;
 //    opacity: 0.9;
 //  }

	// .login-form:before {
	// 	vertical-align: middle;
	// 	display: inline-block;
	// }

	// .login-form {
	// 	max-width: 500px;
	// 	padding: 20px 0;
	// 	width: 80%;
	// 	position: relative;
	// 	margin: 0 auto;

	// 	.label {
	// 		min-width: 60px;
	// 	}

	// 	.input-group {
	// 		max-width: 500px;
	// 		padding: 20px 0;
	// 		width: 80%;
	// 		position: relative;
	// 		margin: 0 auto;
	// 		display: flex;
	// 		align-items: center;

	// 		.input-container {
	// 			display: inline-block;
	// 			width: 100%;
	// 			text-align: left;
	// 			margin-left: 10px;
	// 		}

	// 		.icon {
	// 			width: 30px;
	// 			height: 30px;
	// 		}

	// 		.input {
	// 			position: relative;
	// 			z-index: 2;
	// 			float: left;
	// 			width: 100%;
	// 			margin-bottom: 0;
	// 			box-shadow: none;
	// 			border-top: 0px solid #ccc;
	// 			border-left: 0px solid #ccc;
	// 			border-right: 0px solid #ccc;
	// 			border-bottom: 1px solid #ccc;
	// 			padding: 0px;
	// 			resize: none;
	// 			border-radius: 0px;
	// 			display: block;
	// 			width: 100%;
	// 			height: 34px;
	// 			padding: 6px 12px;
	// 			font-size: 14px;
	// 			line-height: 1.42857143;
	// 			color: #555;
	// 			background-color: #fff;
	// 		}

	// 	}
	// }

	.nk-navigation {
		margin-top: 15px;

		a {
			display: inline-block;
			color: #fff;
			background: rgba(255, 255, 255, .2);
			width: 100px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;
		}

		.icon {
			margin-left: 10px;
			width: 30px;
			height: 30px;
		}
	}

	.register-container {
		margin-top: 10px;

		a {
			display: inline-block;
			color: #fff;
			max-width: 500px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;

			div {
				margin-left: 10px;
			}
		}
	}
	
	.container {
		background-image: url("http://codegen.caihongy.cn/20201125/3cb57c556dc94e948f264d8d08687463.jpg");
		height: 100vh;
		background-position: center center;
		background-size: cover;
		background-repeat: no-repeat;
	
		.login-form {
			right: 50%;
			top: 50%;
			height: auto;
			transform: translate3d(50%, -50%, 0);
			border-radius: 10px;
			background-color: rgba(255,255,255,.5);
			width: 420px;
			padding: 30px 30px 40px 30px;
			font-size: 14px;
			font-weight: 500;
			
			.h1 {
				margin: 0;
				text-align: center;
				line-height: 54px;
			    font-size: 24px;
			    color: #000;
			}
				
			.rgs-form {
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				
				.input {
					width: 100%;
					
					& /deep/ .el-form-item__label {
						line-height: 40px;
						color: 14px;
						font-size: #606266;
					}
					
					& /deep/ .el-input__inner {
						height: 40px;
						color: rgba(15, 15, 16, 1);
						font-size: 14px;
						border-width: 1px;
						border-style: solid;
						border-color: #606266;
						border-radius: 20px;
						background-color: rgba(248, 241, 241, 0.18);
					}
				}
				
				.btn {
					width: 88px;
					height: 44px;
					color: rgba(26, 27, 28, 1);
					font-size: 14px;
					border-width: 1px;
					border-style: solid;
					border-color: rgba(64, 158, 255, 1);
					border-radius: 20px;
					background-color: rgba(84, 221, 231, 1);
				}
			}
		}
	}
</style>
