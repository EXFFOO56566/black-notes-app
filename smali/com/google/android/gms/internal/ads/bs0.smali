.class public final Lcom/google/android/gms/internal/ads/bs0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Lcom/google/android/gms/internal/ads/j9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/j9<",
            "Lcom/google/android/gms/internal/ads/bs0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/is0;

.field public final b:Lorg/json/JSONObject;

.field public final c:Lcom/google/android/gms/internal/ads/fg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/es0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/es0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/bs0;->d:Lcom/google/android/gms/internal/ads/j9;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/is0;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/fg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bs0;->a:Lcom/google/android/gms/internal/ads/is0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bs0;->b:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bs0;->c:Lcom/google/android/gms/internal/ads/fg;

    return-void
.end method
