.class public abstract Lcom/google/android/gms/internal/ads/i;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/google/android/gms/internal/ads/i;

.field public static final b:Lcom/google/android/gms/internal/ads/i;

.field public static final c:Lcom/google/android/gms/internal/ads/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/l;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/i;->a:Lcom/google/android/gms/internal/ads/i;

    new-instance v0, Lcom/google/android/gms/internal/ads/k;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/i;->b:Lcom/google/android/gms/internal/ads/i;

    new-instance v0, Lcom/google/android/gms/internal/ads/n;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/n;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/i;->c:Lcom/google/android/gms/internal/ads/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method
