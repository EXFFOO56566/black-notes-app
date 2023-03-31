.class public final Lcom/google/android/gms/internal/ads/ah2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lorg/json/JSONObject;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/fo;Ljava/lang/String;Lorg/json/JSONObject;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ah2;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ah2;->b:Lorg/json/JSONObject;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ah2;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ah2;->a:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/ah2;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ah2;->e:Z

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ah2;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ah2;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ah2;->b:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ah2;->c:Ljava/lang/String;

    return-object v0
.end method
