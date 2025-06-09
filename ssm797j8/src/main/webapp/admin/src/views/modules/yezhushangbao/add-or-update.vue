<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
                        <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="上报标题" prop="shangbaobiaoti">
          <el-input v-model="ruleForm.shangbaobiaoti" 
              placeholder="上报标题" clearable  :readonly="ro.shangbaobiaoti"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="上报标题" prop="shangbaobiaoti">
              <el-input v-model="ruleForm.shangbaobiaoti" 
                placeholder="上报标题" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="最近行程" prop="zuijinxingcheng">
          <el-input v-model="ruleForm.zuijinxingcheng" 
              placeholder="最近行程" clearable  :readonly="ro.zuijinxingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="最近行程" prop="zuijinxingcheng">
              <el-input v-model="ruleForm.zuijinxingcheng" 
                placeholder="最近行程" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="高危地区" prop="gaoweidiqu">
          <el-select v-model="ruleForm.gaoweidiqu" placeholder="请选择高危地区">
            <el-option
                v-for="(item,index) in gaoweidiquOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="高危地区" prop="gaoweidiqu">
	      <el-input v-model="ruleForm.gaoweidiqu"
                placeholder="高危地区" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="身体状态" prop="shentizhuangtai">
          <el-select v-model="ruleForm.shentizhuangtai" placeholder="请选择身体状态">
            <el-option
                v-for="(item,index) in shentizhuangtaiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="身体状态" prop="shentizhuangtai">
	      <el-input v-model="ruleForm.shentizhuangtai"
                placeholder="身体状态" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="实时体温" prop="shishitiwen">
          <el-input v-model="ruleForm.shishitiwen" 
              placeholder="实时体温" clearable  :readonly="ro.shishitiwen"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="实时体温" prop="shishitiwen">
              <el-input v-model="ruleForm.shishitiwen" 
                placeholder="实时体温" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户名" prop="yonghuming">
          <el-input v-model="ruleForm.yonghuming" 
              placeholder="用户名" clearable  :readonly="ro.yonghuming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户名" prop="yonghuming">
              <el-input v-model="ruleForm.yonghuming" 
                placeholder="用户名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="24">  
        <el-form-item class="upload" v-if="type!='info' && !ro.touxiang" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="touxiangUploadChange"
          ></file-upload>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.touxiang" label="头像" prop="touxiang">
            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.touxiang.split(',')" :src="item" width="100" height="100">
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="楼号" prop="louhao">
          <el-input v-model="ruleForm.louhao" 
              placeholder="楼号" clearable  :readonly="ro.louhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="楼号" prop="louhao">
              <el-input v-model="ruleForm.louhao" 
                placeholder="楼号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房号" prop="fanghao">
          <el-input v-model="ruleForm.fanghao" 
              placeholder="房号" clearable  :readonly="ro.fanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房号" prop="fanghao">
              <el-input v-model="ruleForm.fanghao" 
                placeholder="房号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji" 
              placeholder="手机" clearable  :readonly="ro.shouji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="手机" prop="shouji">
              <el-input v-model="ruleForm.shouji" 
                placeholder="手机" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="上报日期" prop="shangbaoriqi">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.shangbaoriqi" 
                type="date"
                placeholder="上报日期">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.shangbaoriqi" label="上报日期" prop="shangbaoriqi">
              <el-input v-model="ruleForm.shangbaoriqi" 
                placeholder="上报日期" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                                                                                                        </el-row>
                                                                                                                                                                                                                                                                                                                                                                                            <el-row>
            <el-col :span="24">
              <el-form-item v-if="type!='info'"  label="上报内容" prop="shangbaoneirong">
                <editor 
                    style="min-width: 200px; max-width: 600px;"
                    v-model="ruleForm.shangbaoneirong" 
                    class="editor" 
                    action="file/upload">
                </editor>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.shangbaoneirong" label="上报内容" prop="shangbaoneirong">
                    <span v-html="ruleForm.shangbaoneirong"></span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
                                                <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    
    
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"rgba(37, 35, 35, 0.68)","selectFontSize":"14px","btnCancelBorderColor":"rgba(238, 237, 229, 0.33)","inputBorderRadius":"20px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"20px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"20px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(52, 51, 50, 0.88)","addEditBoxColor":"rgba(232, 212, 212, 0.24)","dateIconFontSize":"14px","btnSaveBgColor":"#409EFF","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"rgba(231, 242, 112, 0.92)","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"20px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"20px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"20px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"rgba(159, 111, 85, 0.88)","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"20px","selectFontColor":"#606266","btnSaveBorderColor":"#409EFF","btnSaveBorderWidth":"1px"},
      id: '',
      type: '',
      ro:{
	shangbaobiaoti : false,
	zuijinxingcheng : false,
	gaoweidiqu : false,
	shentizhuangtai : false,
	shishitiwen : false,
	yonghuming : false,
	touxiang : false,
	louhao : false,
	fanghao : false,
	shouji : false,
	shangbaoriqi : false,
	shangbaoneirong : false,
	sfsh : false,
	shhf : false,
      },
            ruleForm: {
                	        shangbaobiaoti: '',
	                        	        zuijinxingcheng: '',
	                        	        gaoweidiqu: '',
	                        	        shentizhuangtai: '',
	                        	        shishitiwen: '',
	                        	        yonghuming: '',
	                        	        touxiang: '',
	                        	        louhao: '',
	                        	        fanghao: '',
	                        	        shouji: '',
	                        	        shangbaoriqi: '',
	                        	        shangbaoneirong: '',
	                        	                        	        shhf: '',
	                      },
                                                    gaoweidiquOptions: [],
                                shentizhuangtaiOptions: [],
                                                                                                                                                                rules: {
                  shangbaobiaoti: [
                            { required: true, message: '上报标题不能为空', trigger: 'blur' },
                                    	                                                              ],
                  zuijinxingcheng: [
                            { required: true, message: '最近行程不能为空', trigger: 'blur' },
                                    	                                                              ],
                  gaoweidiqu: [
                            { required: true, message: '高危地区不能为空', trigger: 'blur' },
                                    	                                                              ],
                  shentizhuangtai: [
                            { required: true, message: '身体状态不能为空', trigger: 'blur' },
                                    	                                                              ],
                  shishitiwen: [
                            { required: true, message: '实时体温不能为空', trigger: 'blur' },
                                    	                                                              ],
                  yonghuming: [
                                    	                                                              ],
                  touxiang: [
                                    	                                                              ],
                  louhao: [
                                    	                                                              ],
                  fanghao: [
                                    	                                                              ],
                  shouji: [
                                    	                                                              ],
                  shangbaoriqi: [
                                    	                                                              ],
                  shangbaoneirong: [
                                    	                                                              ],
                  sfsh: [
                                    	                                                              ],
                  shhf: [
                                    	                                                              ],
              }
    };
  },
  props: ["parent"],
  computed: {
                                                                                                                                                                              },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          	            if(o=='shangbaobiaoti'){
            this.ruleForm.shangbaobiaoti = obj[o];
	    this.ro.shangbaobiaoti = true;
            continue;
          }
	            	            if(o=='zuijinxingcheng'){
            this.ruleForm.zuijinxingcheng = obj[o];
	    this.ro.zuijinxingcheng = true;
            continue;
          }
	            	            if(o=='gaoweidiqu'){
            this.ruleForm.gaoweidiqu = obj[o];
	    this.ro.gaoweidiqu = true;
            continue;
          }
	            	            if(o=='shentizhuangtai'){
            this.ruleForm.shentizhuangtai = obj[o];
	    this.ro.shentizhuangtai = true;
            continue;
          }
	            	            if(o=='shishitiwen'){
            this.ruleForm.shishitiwen = obj[o];
	    this.ro.shishitiwen = true;
            continue;
          }
	            	            if(o=='yonghuming'){
            this.ruleForm.yonghuming = obj[o];
	    this.ro.yonghuming = true;
            continue;
          }
	            	            if(o=='touxiang'){
            this.ruleForm.touxiang = obj[o];
	    this.ro.touxiang = true;
            continue;
          }
	            	            if(o=='louhao'){
            this.ruleForm.louhao = obj[o];
	    this.ro.louhao = true;
            continue;
          }
	            	            if(o=='fanghao'){
            this.ruleForm.fanghao = obj[o];
	    this.ro.fanghao = true;
            continue;
          }
	            	            if(o=='shouji'){
            this.ruleForm.shouji = obj[o];
	    this.ro.shouji = true;
            continue;
          }
	            	            if(o=='shangbaoriqi'){
            this.ruleForm.shangbaoriqi = obj[o];
	    this.ro.shangbaoriqi = true;
            continue;
          }
	            	            if(o=='shangbaoneirong'){
            this.ruleForm.shangbaoneirong = obj[o];
	    this.ro.shangbaoneirong = true;
            continue;
          }
	            	            	                    }
                                                                                                                                                                                                                                              }
            // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
                                                                                                                                    		if(json.yonghuming!=''&&json.yonghuming){
              		this.ruleForm.yonghuming = json.yonghuming
		}
                                  		if(json.touxiang!=''&&json.touxiang){
              		this.ruleForm.touxiang = json.touxiang
		}
                                  		if(json.louhao!=''&&json.louhao){
              		this.ruleForm.louhao = json.louhao
		}
                                  		if(json.fanghao!=''&&json.fanghao){
              		this.ruleForm.fanghao = json.fanghao
		}
                                  		if(json.shouji!=''&&json.shouji){
              		this.ruleForm.shouji = json.shouji
		}
                                                                                                                      } else {
          this.$message.error(data.msg);
        }
      });
                                                                              this.gaoweidiquOptions = "是,否".split(',')
                                        this.shentizhuangtaiOptions = "良好,不适".split(',')
                                                                                                                                                                                                                },
                                                                                                                        // 多级联动参数
                                                                                                                                                        info(id) {
      this.$http({
        url: `yezhushangbao/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
        // 提交
    onSubmit() {
                  // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                                                                                                                                                                                                                                                                                                this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `yezhushangbao/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.yezhushangbaoCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.yezhushangbaoCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
                                                                                                touxiangUploadChange(fileUrls) {
                this.ruleForm.touxiang = fileUrls;
				this.addEditUploadStyleChange()
            },
                                                                                                	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
