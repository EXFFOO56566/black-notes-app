.class public abstract Lcom/google/android/gms/internal/ads/x62;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field protected final a:Lcom/google/android/gms/internal/ads/l52;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field protected final d:Lcom/google/android/gms/internal/ads/ba0$a;

.field protected e:Ljava/lang/reflect/Method;

.field private final f:I

.field private final g:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/l52;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ba0$a;II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x62;->a:Lcom/google/android/gms/internal/ads/l52;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/x62;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/x62;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/x62;->d:Lcom/google/android/gms/internal/ads/ba0$a;

    iput p5, p0, Lcom/google/android/gms/internal/ads/x62;->f:I

    iput p6, p0, Lcom/google/android/gms/internal/ads/x62;->g:I

    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method public b()Ljava/lang/Void;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/x62;->a:Lcom/google/android/gms/internal/ads/l52;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/x62;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/x62;->c:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/l52;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/x62;->e:Ljava/lang/reflect/Method;

    if-nez v3, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/x62;->a()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/x62;->a:Lcom/google/android/gms/internal/ads/l52;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/l52;->j()Lcom/google/android/gms/internal/ads/ud1;

    move-result-object v3

    if-eqz v3, :cond_1

    iget v4, p0, Lcom/google/android/gms/internal/ads/x62;->f:I

    const/high16 v5, -0x80000000

    if-eq v4, v5, :cond_1

    iget v4, p0, Lcom/google/android/gms/internal/ads/x62;->g:I

    iget v5, p0, Lcom/google/android/gms/internal/ads/x62;->f:I

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long/2addr v6, v1

    const-wide/16 v1, 0x3e8

    div-long/2addr v6, v1

    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/google/android/gms/internal/ads/ud1;->a(IIJ)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/x62;->b()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
