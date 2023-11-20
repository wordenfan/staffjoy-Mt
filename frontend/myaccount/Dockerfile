FROM node:14.17-alpine as builder
WORKDIR '/build'
COPY myaccount ./myaccount
COPY resources ./resources
COPY third_party ./third_party

WORKDIR '/build/myaccount'

# RUN npm config set phantomjs_cdnurl=http://cdn.npm.taobao.org/dist/phantomjs_cdnurl
# RUN yarn config set phantomjs_cdnurl https://npm.taobao.org/mirrors/phantomjs
# RUN npm install phantomjs-prebuilt@2.1.16 --ignore-scripts
# RUN npm config set registry https://registry.npm.taobao.org
# RUN npm config get registry

# RUN npm cache clean --force
RUN apk add python
RUN npm install -g cnpm --registry=https://registry.npm.taobao.org
# RUN npm install -g cnpm --registry=https://registry.npmmirror.com

# RUN npm rebuild node-sass || npm rebuild node-sass --force
#RUN cnpm install -g node-gyp
# RUN cnpm install -D webpack
# RUN cnpm install -D webpack-cli
#RUN cnpm install -D html-webpack-plugin
#RUN cnpm install -D favicons-webpack-plugin
#RUN cnpm install -D webpack-cleanup-plugin

# RUN npm config set sass_binary_site=https://npm.taobao.org/mirrors/node-sass
# RUN npm install -g node-gyp
# RUN cnpm install node-sass

RUN cnpm install
# RUN cnpm rebuild node-sass
RUN cnpm install --save-dev node-sass
RUN npm run build

RUN ls /build/myaccount/dist

FROM nginx
EXPOSE 80
COPY --from=builder /build/myaccount/dist /usr/share/nginx/html

