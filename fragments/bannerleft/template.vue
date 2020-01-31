<template>
  <div style="width: 80%; margin: 0 auto; font-family: Arial, Helvetica, sans-serif;"
  v-bind:data-per-path="model.path">
    <div style="height: 500px; background-position: center; background-repeat: no-repeat; background-size: cover; position: relative;">
      <div style="text-align: left; position: absolute; top: 35%; left: 20%; transform: translate(-50%, -50%); color: black;">
        <h2 style="font-size:50px" v-html="model.title"></h2>
        <p v-html="model.text"></p>
        <a href="#" class="btn m-2 btn-black" style="backgroundColor: primary; borderColor:primary;"
        v-if="model.showbutton == 'true'" v-html="model.buttontext"></a>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

