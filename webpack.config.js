module.exports = {
    
    entry:[__dirname+'/app/module1.js',__dirname+'/app/module2.js',],
    output:{
        path:__dirname+'/build',
        filename:'bundle.js'
    },
     module: {
    loaders: [
      {
        test: /\.js$/, // a regular expression that catches .js files
        exclude: /node_modules/,
        loader: 'babel-loader'
      }
    ]
  },
  devServer: {
    port: 3000, // most common port
    contentBase: './build',
    inline: true
  }
}
